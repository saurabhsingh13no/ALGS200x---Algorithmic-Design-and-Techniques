import java.util.*;
import java.io.*;
import java.lang.Math;

class Quadrouple {
  int n;
  int w;
  int[] values;
  int[] weights;

  Quadrouple(int n, int w) {
    this.n = n;
    this.w = w;
    values = new int[n];
    weights = new int[n];
  }

  public void setValues(int[] values) {
    this.values = values;
  }

  public void setWeights(int[] weights) {
    this.weights = weights;
  }

}

class FractionalKnapsack
{
  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // int n = scan.nextInt();
    // System.out.printf("Enter %d dollar values seperated by space : ",n);
    // int[] values = new int[n];
    // for (int i=0;i<n;i++) {
    //   values[i] = scan.nextInt();
    // }
    //
    // System.out.printf("Now enter %d values for weights in same order : ",n);
    // int[] weights = new int[n];
    // for (int i=0;i<n;i++) {
    //   weights[i] = scan.nextInt();
    // }
    //
    // System.out.printf("Enter the maximum capacity of knapsack : ");
    // int w = scan.nextInt();

    // n, values, weights ,w = readFile(filepath);
    String filepath = "3_2_loot.in";
    Quadrouple params = readFile(filepath);
    Integer n = params.n;
    Integer w = params.w;
    int[] values = params.values;
    int[] weights = params.weights;
    maximizeLoot(values, weights, w);
  }

  public static Quadrouple readFile(String filepath) {
    File file = new File(filepath);
    int n, w;
    int[] values;
    int[] weights;
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String st;
      String[] arr1 = br.readLine().split(" ");
      n = Integer.valueOf(arr1[0]);
      w = Integer.valueOf(arr1[1]);

      values = new int[n];
      weights = new int[n];

      int index = 0;
      while((st = br.readLine())!=null) {
        String[] arr = st.split(" ");
        values[index] = Integer.parseInt(arr[0]);
        weights[index] = Integer.parseInt(arr[1]);
        index += 1;
      }
      System.out.println(n+ " " +w);
      Quadrouple obj = new Quadrouple(n, w);
      obj.setValues(values);
      obj.setWeights(weights);
      return obj;
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
      // System.out.println("saurabh singh");
    }
    catch(IOException i) {
      i.printStackTrace();
    }

    return new Quadrouple(0,0);
  }

  public static void maximizeLoot(int[] values, int[] weights, int w) {
    int[] amounts = new int[weights.length];
    for (int i=0;i<weights.length;i++) {
      amounts[i] = 0;
    }
    float totalValue = 0;

    for (int i=0;i<values.length;i++) {
      if (w==0) {
        //System.out.println(totalValue + " and " + amounts);
        break;
      }

      int pos = BestLoot(values, weights);
      int a = Math.min(weights[pos], w);
      amounts[pos] = a;

      w = w-a;
      System.out.println(w + " "+pos+" "+a+ " "+(float)a*values[pos]/weights[pos]+" "+totalValue);
      totalValue += (float)a*values[pos]/weights[pos];
      weights[pos] -= a;
    }

    System.out.println(totalValue+" "+w);
    // for (int weight : amounts) {
    //   System.out.println(weight);
    // }
  }

  public static int BestLoot(int[] values, int[] weights) {

    int best = 0;
    float bestRatio = 0;
    for (int i=0;i<values.length;i++) {
      if (weights[i] > 0) {
        if ((float)values[i]/weights[i] > bestRatio) {
          bestRatio = (float)values[i]/weights[i];
          best = i;
        }
      }
    }

    return best;
  }

}
