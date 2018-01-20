package ru.job4j.start;

//Абстрактный класс на его основе  создаем фигуру слон ,которую создаем в классе слон

public abstract class Figure  {

   private final Cell position;


    public Figure(Cell position) {
        this.position = position;

    }



    public abstract Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException;

    public abstract Figure copy(Cell dest);





}
