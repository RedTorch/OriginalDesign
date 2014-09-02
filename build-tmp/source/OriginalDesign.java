import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int radius = 0;
int radII = 100;
int txtx;
int txty;
double spd = 0;
double spdII = 0;
public void setup()
{
  size(400,400);
  stroke(0);
}
public void draw()
{
  background(0);
  if(radius > 400)
  {
  	radius = 0;
  }
  if(radII > 400)
  {
  	radII = 0;
  }
  fill(255);
  rectMode(CENTER);
  rect(200,200,2,2);
  noFill();
  rectMode(CENTER);
  rect(200,200,radius,radius);
  radius = radius + (int)spd;
  spd = 10-((int)radius/100);
  noFill();
  rectMode(CENTER);
  rect(200,200,radII,radII);
  radII = radII + (int)spdII;
  fill((int)(Math.random()*255));
  spdII = 10-((int)radII/100);
  stroke(255);
  line(200,200,400,400);
  line(200,200,400,0);
  line(200,200,0,0);
  line(200,200,0,400);
  fill(0);
  triangle(200,200,40,400,360,400);
  txtx = (int)(Math.random());
  txty = (int)(Math.random());
  textAlign(CENTER);
  fill((int)(Math.random()*255));
  text("Endless Hallway",(txtx*4)+200,(txty*4)+60);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
