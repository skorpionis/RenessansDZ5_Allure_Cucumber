#language: ru
Функционал: RenCredit
@all
  Сценарий: 1 сумма - "300000"
    * Ссылка
    * Вклады
    * Выбрать "Рубли"
    * Сумма "300000"
    * На срок "6"
    * Пополнение "50000"
    * Капитализация
    * Расчеты по вкладу
      | 6.75%      |
      | 564 398,21 |
      | 250 000    |
      | 14 398,21  |
  @all
  Сценарий: 2 сумма - "500000"
  Ссылка
    * Вклады
    * Выбрать "Рубли"
    * Сумма "500000"
    * На срок "9"
    * Пополнение "70000"
    * Капитализация
    * Расчеты по вкладу
      | 6.30%      |
      | 871 330,60 |
      | 350 000    |
      | 21 330,60  |