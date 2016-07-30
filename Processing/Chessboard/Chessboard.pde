int nRows = 90;
int nColumns =90;
int x = 800/nRows;
int y = 800/nColumns;
void setup() {
  size(nRows*x, nColumns*y);
  background(255);
}
void draw() {
  for (int l=0; l<nColumns+1; l++) {
    for (int i=0; i<nRows+1; i++) {
      if ((i+l)%2 == 0) {
        fill(0);
        rect(i*x, l*y, 800/nRows, 800/nColumns);
      }
    }
  }
}

