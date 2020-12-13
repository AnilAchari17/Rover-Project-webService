package com.example.RoverProject.Bean;

public class DirectionBean {

	public enum Direction {up, down,left,right;
		@Override
		public String toString()
		{
	        switch (this) {
	            case up: return "up";
	            case down: return "down";
	            case left: return "left";
	            case right: return "right";
	            
	        }
			return null;}}
	
	private Direction direction;

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
}
