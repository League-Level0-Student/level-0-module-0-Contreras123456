PImage face;
void setup (){
  face = loadImage("face.jpg");
  size(900,900);
  face.resize(1000,900);
 }
void draw(){
  fill(mouseX,203,79);
  image(face,0,0);
  ellipse(350,410,180,250);
  ellipse(650,410,180,250);
  fill(0,0,0);
  ellipse(350,350,100,100);
  ellipse(650,350,100,100);
}
