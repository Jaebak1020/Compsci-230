/**
 * ==========================================================================================
 *  AnimationPanel.java : Moves shapes around on the screen according to different paths.
 *  It is the main drawing area where shapes are added.
 *  YOUR UPI: jbah189
 *  =========================================================================================
 */

import java.awt.*;
import java.util.ArrayList;

class AnimationViewer  {
	//modify data field currentShapeType and currentPathType
    private ShapeType currentShapeType=Shape.DEFAULT_SHAPETYPE; // the current shape type,
    private PathType currentPathType=Shape.DEFAULT_PATHTYPE;  // the current path type

    private ArrayList<Shape> shapes = new ArrayList<Shape>(); //create the ArrayList to store shapes
    private Color currentColor=Shape.DEFAULT_COLOR;  // the current fill colour of a shape
    private Color currentBorderColor = Shape.DEFAULT_BORDER_COLOR;
    private int currentPanelWidth=Shape.DEFAULT_PANEL_WIDTH, currentPanelHeight = Shape.DEFAULT_PANEL_HEIGHT, currentWidth=Shape.DEFAULT_WIDTH, currentHeight=Shape.DEFAULT_HEIGHT;


	public AnimationViewer() {}
    //complete the get/set methods

	//Complete the createNewshape method
    protected void createNewShape() {
		switch (currentShapeType) {
			case SQUARE: {
				int minDimension = Math.min(currentHeight, currentWidth);
				SquareShape newShape = new SquareShape(0, 0, minDimension, currentPanelWidth, currentPanelHeight, currentColor, currentBorderColor, currentPathType);
				shapes.add(newShape);
				break;
			}
			case RECTANGLE: {
				RectangleShape newShape = new RectangleShape(0, 0, currentWidth, currentHeight, currentPanelWidth, currentPanelHeight, currentColor, currentBorderColor, currentPathType);
				shapes.add(newShape);
				break;
			}
			default: {
				int minDimension = Math.min(currentHeight, currentWidth);
				PolygonShape newShape = new PolygonShape(0, 0, minDimension, currentPanelWidth, currentPanelHeight, currentColor, currentBorderColor, currentPathType, currentShapeType);
				shapes.add(newShape);

			}
		}
    }
    public void paintComponent(Graphics g) {
		for (Shape currentShape: shapes) {
			currentShape.move();
			currentShape.draw(g);
		}
    }
	public int getCurrentWidth() { return  currentWidth; }
	public int getCurrentHeight() { return currentHeight; }
	public void setCurrentWidth(int w) {currentWidth=w;}
    public void setCurrentHeight(int h) {currentHeight=h;}

	public ShapeType getCurrentShapeType() {
		return currentShapeType;
	}

	public PathType getCurrentPathType() {
		return currentPathType;
	}

	public void setCurrentShapeType(ShapeType s) {
		this.currentShapeType = s;
	}

	public void setCurrentPathType(PathType p) {
		this.currentPathType = p;
	}
}