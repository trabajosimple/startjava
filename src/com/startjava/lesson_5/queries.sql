\echo 'Вывести всю таблицу'
SELECT *
  FROM public.jaegers;

\echo 'Отобразить только не уничтоженных роботов'
SELECT *
  FROM public.jaegers
 WHERE status != 'Destroyed';

\echo 'Отобразить роботов нескольких серий: Mark-1 и Mark-4'
SELECT *
  FROM public.jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo 'Отобразить всех роботов, кроме Mark-1 и Mark-4'
SELECT *
  FROM public.jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'Отсортировать таблицу по убыванию по столбцу mark'
SELECT *
  FROM public.jaegers
 ORDER BY mark desc;

\echo 'Отобразить информацию о самом старом роботе'
SELECT *
  FROM public.jaegers
 ORDER BY launch
 LIMIT 1;

\echo 'Отобразить роботов, которые уничтожили больше всех kaiju'
SELECT *
  FROM public.jaegers
 ORDER BY "kaijuKill" desc
 LIMIT 5;

\echo 'Отобразить средний вес роботов'
SELECT avg(weight)
  FROM public.jaegers;

\echo 'Увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE public.jaegers
   SET "kaijuKill" = "kaijuKill" + 1
 WHERE status = 'Active';

\echo 'Удалить уничтоженных роботов'
DELETE
  FROM public.jaegers
 WHERE status IN ('Destroyed');