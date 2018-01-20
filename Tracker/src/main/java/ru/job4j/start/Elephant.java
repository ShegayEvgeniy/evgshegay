package ru.job4j.start;


public class Elephant extends Figure {

    private Cell position;

     private Cell[] array = new Cell[8];

    public Elephant(Cell position) {
       super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException {

        int one = source.coordX();
        int two = source.coordY();
        int three = dest.coordX();
        int four = dest.coordY();


        if ((three - one) == (four - two) || (one - three) == (two - four) || (one - three) == (four - two) || (three - one) == (four - two)) {

            if (one == two && one == 0) {       // белый слон двигается из позиции 0-0 вниз по главной диагонали
                one += 1;
                two += 1;
                int position = 0;
                while (one < dest.coordX() && two < dest.coordY()) {
                    array[position] = new Cell(one, two);
                    position++;
                    one++;
                    two++;
                }
            }

            if (one == two && one != 0) {         // белый слон движется по главной диагонали из позиции отличной от 0-0 ячейки шахматной доски
                while (one <= 7) {
                    one += 1;
                    two += 1;
                    int position = 0;
                    array[position] = new Cell(one, two);
                    position++;
                    one++;
                    two++;
                }
            }

            if (three < one && four < two) {               // определяем положение слона на доске и по его конечной точке реализуем движение
                one -= 1;
                two -= 1;
                int position = 0;
                array[position] = new Cell(one, two);
                position++;
                one--;
                two--;
            }

            if (three < one && four > two) {
                one -= 1;
                two += 1;
                int position = 0;
                array[position] = new Cell(one, two);
                position++;
                one--;
                two++;
            }

            if (three > one && four > two) {
                one += 1;
                two -= 1;
                int position = 0;
                array[position] = new Cell(one, two);
                position++;
                one++;
                two--;
            }

            if (three > one && four > two) {
                one += 1;
                two += 1;
                int position = 0;
                array[position] = new Cell(one, two);
                position++;
                one++;
                two++;
            }

            for (Cell cell : array) {
                if (cell == source) {
                    throw new OccupiedWayException();
                }
            }
        } else {
            throw new ImposibleMoveException();
        }
        return array;

    }


    @Override
    public Figure copy(Cell dest) {
        return new Elephant(dest);
    }

}
