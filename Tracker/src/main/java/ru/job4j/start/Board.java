package ru.job4j.start;

/*2. Создать абстрактный класс Figure - этот класс будет описывать абстрактное поведение шахматной доски.

        2. В Figure сделать поле final Cell position - и конструктор. В классе не должно быть методов set get.
        Cell - описывает ячейки шахматной доски. Содержит координаты x, y. Cell не может содержать объект Figure.
        Важно, что position объявлена final = изменения координаты будет происходить за счет пересоздания объекта.
        Про это рассказано ниже.

        3. Добавить в класс Figure абстрактный метод Cell[] way(Cell source, Cell dest) throw ImposibleMoveException

        Метод должен работать так. dest - задают ячейку куда следует пойти. Если фигура может туда пойти. то Вернуть массив ячеек. которые должна пройти фигура.

        Если фигура туда пойти не может. выбросить исключение ImposibleMoveException

        4. Добавьте абстрактный метод Figure Figure.copy(Cell dest) - он должен создавать объект Figure с координатой Cell dest.
        Например. для класса
class Bishop impl Figure {
    Figure copy(Cell dest) {
        return new Bishop(dest);
    }
}

5. Создать класс Board.

        6. В классе создать массив Figure[][] figures = new Figure[8][8] - содержит фигуры. Клетки доски.

        7. Добавить метод boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException

        8. Метод должен проверить
        - Что в заданной ячейки есть фигура. если нет. то выкинуть исключение
        - Если фигура есть. Проверить может ли она так двигаться. Если нет то упадет исключение
        - Проверить что полученный путь. не занят фигурами. Если занят выкинуть исключение
        - Если все отлично. Записать в ячейку новое новое положение Figure figure.copy(Cell dest)

        9. Изначально сделайте. только движения фигуры слон и покажите промежуточный результат.*/


public class Board extends Figure {


    private Figure[][] figures = new Figure[8][8];

    public Board(Cell position) {
        super(position);
    }

  /*  Добавить метод boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException

8. Метод должен проверить
   - Что в заданной ячейки есть фигура. если нет. то выкинуть исключение
   - Если фигура есть. Проверить может ли она так двигаться. Если нет то упадет исключение
   - Проверить что полученный путь. не занят фигурами. Если занят выкинуть исключение
   - Если все отлично. Записать в ячейку новое новое положение Figure figure.copy(Cell dest)

9. Изначально сделайте. только движения фигуры слон и покажите промежуточный результат.*/

    public boolean move(Cell source, Cell dest) {


    }


    // Метод должен работать так. dest - задают ячейку куда следует пойти. Если фигура может туда пойти. то Вернуть массив ячеек. которые должна пройти фигура.

    // Если фигура туда пойти не может. выбросить исключение ImposibleMoveException

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[0];
    }


    // метод создает новый объект Figure с координатами Cell dest


    @Override
    public Figure copy(Cell dest) {
        return new Board(dest);
    }
}
