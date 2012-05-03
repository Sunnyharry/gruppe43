import java.awt.Color;
import java.awt.Graphics;


public class BombermanLevel {
	
	private static final int DIM = 40;
	
	private short[][] tiles;
	private int width, height;
	
	public BombermanLevel(int width, int height){
		this.width = width/DIM;
		this.height = height/DIM;
		tiles = new short[this.width][this.height];
		fillRandomly();}

	private void createBorder(){
		
	}
	
	private void fillRandomly() {
		for(int i=0;i<width;i++)
			for(int j=0;j<height;j++){
				if((j%2 == 1) && (i%2 == 1))
					tiles[i][j] = 2;
				else if((i==2 || i==width-3) && ((j>=0 && j<=2) || (j>=height-3 && j<=height-1)))
					tiles[i][j]=1;
				else if((j==2 || j==height-3) && ((i>=0 && i<2) || (i>width-3 && i<=width-1)))
					tiles[i][j]=1;
				else if((i>=3 && i<=width-4) || (j>=3 && j<=height-4))
					tiles[i][j]=(short)(Math.random()*2);
				}
		}

	public void draw(Graphics g) {
		for(int i=0;i<width;i++){
			for(int j=0;j<height;j++){
				if(tiles[i][j]==0){
					g.setColor(Color.GREEN);
					g.fillRect(i*DIM,j*DIM,DIM,DIM);}
				else if(tiles[i][j]==1){
					g.setColor(Color.GRAY);
					g.fillRect(i*DIM,j*DIM,DIM,DIM);}
				else{
					g.setColor(Color.DARK_GRAY);
					g.fillRect(i*DIM,j*DIM,DIM,DIM);}
			}
			
		}
		
	}

	
}
