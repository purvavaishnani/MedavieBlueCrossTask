package com;

public class Fan {

    public Cord cord1;
    public Cord cord2;

    public Direction direction = Direction.FORWARD;

    public  Status status = Status.OFF;

    public Fan() {
        
    }

    public Cord getCord1() {
        return cord1;
    }

    public void setCord1(Cord cord1) {
        this.cord1 = cord1;
    }

    public Cord getCord2() {
        return cord2;
    }

    public void setCord2(Cord cord2) {
        this.cord2 = cord2;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speed;

    public Fan(Cord cord1, Cord cord2, Direction direction, Status status, int speed) {
        this.cord1 = cord1;
        this.cord2 = cord2;
        this.direction = direction;
        this.status = status;
        this.speed = speed;
    }

	@Override
	public String toString() {
		return "Fan [direction=" + direction + ", status=" + status
				+ ", speed=" + speed + "]";
	}
    
    
}