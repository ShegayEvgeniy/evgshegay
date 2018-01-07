package ru.job4j.start;

public class Board  {

  //  В данном классе реализовал движение слона из левого нижнего угла доски в правый верхний угол шахматной доски

    public static Figure[][] figures = new Figure[8][8];
    private static   Cell source = new Cell(1, 1);
    private static Cell dest = new Cell(8, 8);
    private static Figure elephant = new Elephant(source);

    public void fillFigures() {
        figures[0][7] = elephant; //добавили слона в массив
    }



    public Cell coordinat() { // данный метод проверяте есть ли в массиве под этим индексом объект слон
        try {
            if (figures[0][7] == null) {
                throw new FigureNotFoundException("The figure is eempty");
            }
        } catch (FigureNotFoundException e) {
            e.printStackTrace();
        }

        if (figures[0][7] == elephant) {
            System.out.println("В данной ячейке есть фигура Слон. Ее координаты  такие - " + source.coordX() + " " + source.coordY());
        }
        return source;
    }



    public Board() {
        super();
    }


    public boolean move(Cell source, Cell dest) {

         boolean test = false;
         Cell[]test2 = null;
         try {
             test2 = elephant.way(source, dest);
             test = true;
         } catch (ImposibleMoveException e) {
             e.printStackTrace();
         } catch (OccupiedWayException o) {
             o.printStackTrace();
         }
        System.out.println(test);
        return test;
    }


    public static void main(String[] args) throws FigureNotFoundException, OccupiedWayException, ImposibleMoveException {
        Board board = new Board();
        board.fillFigures();
        board.coordinat();
        board.move(source, dest);
        elephant.copy(dest);
        System.out.println("Фигура перемещена в ячейку по координатм  Cell dest " + dest.coordX() + " " + dest.coordY());
    }
}
