int nRows = 8;
int nColumns = 8;
void setup() {

  size(nRows*100, nColumns*100);
  background(255);
}
void draw() {

  int x = 100;
  for (int l=0; l<nColumns+1; l++) {
    for (int i=0; i<nRows+1; i++) {
      if ((i+l)%2 == 0) {
        fill(0);
        rect(i*x, l*x, 100, 100);
      }
    }
    //     else {
    //      rect(i*x, i*x, 100, 100);
    //      fill(255);
    //    }
  }
}

