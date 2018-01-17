package ru.job4j.start;

// класс создает фигуру слона и реализует его движение по диагонали
public class Elephant extends Figure {

    private Cell position;

     private Cell[] array = new Cell[8];

    public Elephant(Cell position) {
       super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException  {
        int one = dest.coordX();
        int two = dest.coordY();
        Figure[][]figures = new Figure[8][8];
        Figure elephant = new Elephant(source);
        Board board = new Board(source, dest, figures, elephant);
        board.fillFigures(one, two);
            if (figures[one][two] != null) {
                int a = dest.coordX() - source.coordX();
                int b = dest.coordY() - source.coordY();

                if (a > source.coordX() && b > source.coordY()) {   // движение слона по диагонали  с левого верхнего угла в правый нижний угол
                    int i = source.coordX();
                    int j = source.coordY();
                    i += 1;
                    j += 1;
                    int position = 0;
                    while (i < dest.coordX() && j < dest.coordY()) {
                        array[position] = new Cell(i, j);
                        position++;
                        i++;
                        j++;
                    }
                }
                if (a < source.coordX() && b < source.coordY()) {  // движение слона из правого нижнего угла в вверхний левый
                    int i = source.coordX();
                    int j = source.coordY();

                    i -= 1;
                    j -= 1;
                    int position = 0;
                    while (i > dest.coordX() && j > dest.coordY()) {
                        array[position] = new Cell(i, j);
                        position++;
                        i--;
                        j--;
                    }
                }

                if (a > source.coordX() && b < source.coordY()) {  // движение слона из левого нижнего угла в правый вверхний
                    int i = source.coordX();
                    int j = source.coordY();

                    i += 1;
                    j -= 1;
                    int position = 0;
                    while (i < dest.coordX() && j > dest.coordY()) {
                        array[position] = new Cell(i, j);
                        position++;
                        i++;
                        j--;
                    }
                }

                if (a < source.coordX() && b > source.coordY()) {  // движение слона из правого нижнего угла в вверхний левый
                    int i = source.coordX();
                    int j = source.coordY();

                    i -= 1;
                    j += 1;
                    int position = 0;
                    while (i > dest.coordX() && j < dest.coordY()) {
                        array[position] = new Cell(i, j);
                        position++;
                        i--;
                        j++;
                    }
                }

            }
        return array;
    }


    @Override
    public Figure copy(Cell dest) {
        return new Elephant(dest);
    }

}
