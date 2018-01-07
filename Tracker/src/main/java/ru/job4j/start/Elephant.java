package ru.job4j.start;

//Класс создает фигуру слон

import static ru.job4j.start.Board.figures;

public class Elephant extends Figure {

    private Cell[]tmp;

    public Elephant(Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException {
        boolean test = true;
               if (test) {
                  Cell one = new Cell(1, 6);
                  Cell two = new Cell(2, 5);
                  Cell three = new Cell(3, 4);
                  Cell four = new Cell(4, 3);
                  Cell five = new Cell(5, 2);
                  Cell six = new Cell(6, 1);

                 Cell[]tmp = new Cell[6];
                 Cell slon = new Cell(7, 1);
                 Figure elephant2 = new Elephant(slon); //создал новую фигуру слон , чтобы можно было проверить как работают исключения Occupied and Impossible
                 figures[7][7] = elephant2;
                 if (figures[1][6] == elephant2) {
                     throw new ImposibleMoveException(); // еще не знаю пока что как сделать так , чтобы в=срабатывало сразу два исключения  а то до второго не доходит
                                                         // выводит только Impossible
                  }
                  if (figures[1][6] == elephant2) {
                     throw new OccupiedWayException();   // не оптимальное решение знаю , но пока еще не придумал как его засунуть в цикл
                  }
                  if (figures[1][6] != elephant2) {
                     tmp[0] = one;
                  }
                   if (figures[2][5] == elephant2) {
                       throw new ImposibleMoveException();
                   }
                   if (figures[2][5] == elephant2) {
                       throw new OccupiedWayException();
                   }
                   if (figures[2][5] != elephant2) {
                       tmp[1] = two;
                   }
                   if (figures[3][4] == elephant2) {
                       throw new ImposibleMoveException();
                   }
                   if (figures[3][4] == elephant2) {
                       throw new OccupiedWayException();
                   }
                   if (figures[3][4] != elephant2) {
                       tmp[2] = three;
                   }
                   if (figures[4][3] == elephant2) {
                       throw new ImposibleMoveException();
                   }
                   if (figures[4][3] == elephant2) {
                       throw new OccupiedWayException();
                   }
                   if (figures[4][3] != elephant2) {
                       tmp[3] = four;
                   }
                   if (figures[5][2] == elephant2) {
                       throw new ImposibleMoveException();
                   }
                   if (figures[5][2] == elephant2) {
                       throw new OccupiedWayException();
                   }
                   if (figures[5][2] != elephant2) {
                       tmp[4] = five;
                   }
                   if (figures[6][1] == elephant2) {
                       throw new ImposibleMoveException();
                   }
                   if (figures[6][1] == elephant2) {
                       throw new OccupiedWayException();
                   }
                   if (figures[6][1] != elephant2) {
                       tmp[5] = six;
                   }
               }
     return tmp;
    }

    @Override
    public Figure copy(Cell dest) {
        return new Elephant(dest);
    }

}
