package ru.job4j.start;

// класс реализует шахматную доску с фигурой слон
public class Board  {


    private Cell source;
    private Cell dest;
    private  Figure[][] figures;
    private Figure elephant;

    public void fillFigures(int i, int j) {
        figures[i][j] = elephant; //добавили слона в массив
    }

    public boolean testArray(Cell source) throws FigureNotFoundException {
        int a = source.coordX();
        int b = source.coordY();
        boolean tmp = false;
        if (figures[a][b] != null) {
            tmp = true;
        } else {
           throw  new  FigureNotFoundException();
        }
        return tmp;
    }

    public Board(Cell source, Cell dest, Figure[][] figures, Figure elephant) {
        this.source = source;
        this.dest = dest;
        this.figures = figures;
        this.elephant = elephant;
    }


    public boolean move(Cell source, Cell dest)  {

        int one = source.coordX();
        int two = source.coordX();
        Cell[]test = new Cell[8];
        boolean testCondition = false;

        try {
        if (testArray(source)) {
            System.out.println(" ");
        }
        } catch (FigureNotFoundException f) {
            System.out.println(" ");
            }



        try {
             test = elephant.way(source, dest);
        } catch (OccupiedWayException o) {
            System.out.println("The way is occupied");
        } catch (ImposibleMoveException i) {
            System.out.println("The move is impossible");
        }

        elephant.copy(dest);
        testCondition = true;
        return testCondition;

        }


    }




