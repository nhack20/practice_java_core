package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._16_17_callable_future._16_callable_example1;

import java.util.concurrent.*;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 16. Интерфейсы Callable и Future. Часть 1
 * @author Sergei Begletsov
 * @version 1
 * @since 17.10.2021
 */

//Интерфейсы Callable и Future
//1. Callable представляет собой определенное задание, которое выполняется потоком (так же как и Runnable)
//2. Callable имеет:
//   - return тип, а не void
//   - может выбрасывать Exception
//3. Метод submit() передает наше задание (task) в thread pool, для выполнения одним из потоков и возвращает тип Future,
//   в котором хранится результат задания.
//4. Метод get() позволяет получить результат выполнения нашего задания из объекта Future.

//5. Runnable можем использовать как при отдельном создании Thread, так и при ExecutorService
//5.1 Runnable используется когда не обязательно возвращать что-то.
//6. Callable можно использовать только с ExecutorService.
//6.1 Callable используется когда что-то НУЖНО ВОЗВРАЩАТЬ.

public class Factorial {
    public static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //1 Вариант - расчета факториала через интерф. Runnable
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        RunnableFactorial runnableFactorial = new RunnableFactorial(6);
//        executorService.execute(runnableFactorial);
//        executorService.shutdown();
//        executorService.awaitTermination(10, TimeUnit.SECONDS);
//        System.out.println(factorialResult);

        //1.1 Вариант - расчета факториала через интерф. Runnable
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        RunnableFactorial runnableFactorial = new RunnableFactorial(6);
//        //executorService.execute(runnableFactorial); //было
//        Future future = executorService.submit(runnableFactorial);//стало
//        executorService.shutdown();
//        executorService.awaitTermination(10, TimeUnit.SECONDS);
//        System.out.println(future.get()); //всегда null
//        System.out.println(future.isDone()); //true
//        System.out.println(factorialResult); //720

        //2 Вариант - расчета факториала через интерф. Callable
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableFactorial callableFactorial = new CallableFactorial(5);
        Future<Integer> future = executorService.submit(callableFactorial);
        try {
            System.out.println(future.isDone());
            System.out.println("Хотим получить результат факториала");
            factorialResult = future.get();
            System.out.println("Получаем результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}
