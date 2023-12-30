
package gradecalculator;


public class cal {
    private int a,b,c,d,e,f,g;
    char grade;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setF(int f) {
        this.f = f;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public int getG() {
        return g;
    }
//    public void addNo(int a,int b,int c,int d,int e,int f,int g)
 //  {
       
   //}
    
        public int addNo(int a, int b, int c, int d, int e, int  f, int g) 
        {
        // Convert String values to integers
      /*  int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);
        int cValue = Integer.parseInt(c);
        int dValue = Integer.parseInt(d);
        int eValue = Integer.parseInt(e);
        int fValue = Integer.parseInt(f);
        int gValue = Integer.parseInt(g);*/
      int sum = a+ b + c + d + e + f + g;

        return sum;
        
    
        }
 
    
    public String calgrade(double percentage) {
    char grade;

    if (percentage >= 0 && percentage <= 100) {
        if (percentage > 84.5) {
            grade = 'A';
        } else if (percentage > 79.5) {
            grade = 'A';
        } else if (percentage > 74.5) {
            grade = 'B';
        } else if (percentage > 69.5) {
            grade = 'C';
        } else if (percentage > 64.5) {
            grade = 'D';
        } else if (percentage > 59.5) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        return String.valueOf(grade);
    } else {
        return "Invalid percentage";
    }
}

    }