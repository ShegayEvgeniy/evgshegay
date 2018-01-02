package ru.job4j.start;
//import ru.job4j.start.ImposibleMovieException;



public abstract class Figure  {

   private final Cell position ;


    public Figure(Cell position){
        this.position = position;

    }

    public abstract Cell[] way(Cell source, Cell dest)  //throw ImposibleMoveException  ;

    public abstract Figure copy(Cell dest);





}
