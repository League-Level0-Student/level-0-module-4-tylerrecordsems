PImage face;
void setup() {
  size(800,800);
    face = loadImage("GOOGLY.png");

    face.resize(800,800);
}
int X= 0;
int Y=0;
void draw() {
  background(face);
fill(#FFFFFF);
ellipse(270,420,150,100);
ellipse(480,350,100,150);
fill(#0A0A0A);
ellipse(X,Y,50,50);
ellipse(X+190,Y-100,30,30);
print (mouseX +" "+ mouseY +"\n ");
if(mouseX>270-60 && mouseX<420-60 ){
  X=mouseX;
}
if(mouseY>350 && mouseY<480 ){
  Y=mouseY;
// HINT: To find out where to put it, add code to print the mouseX and mouseY where you click the mouse.
}
}
