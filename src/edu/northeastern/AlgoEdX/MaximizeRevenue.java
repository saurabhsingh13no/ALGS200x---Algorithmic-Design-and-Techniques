import java.io.*;
import java.util.Arrays;

class Marketing {
  long[] profits;
  long[] clicks;

  Marketing(long[] profits, long[] clicks) {
    this.profits = profits;
    this.clicks = clicks;
  }
}

class MaximizeRevenue {
  public static void main(String[] args) throws Exception {

    String filepath = "3_3_dot_product20180216.in";
    Marketing params =  readFile(filepath);
    long[] profits = params.profits;
    long[] clicks = params.clicks;

    Arrays.sort(profits);
    Arrays.sort(clicks);

    long maxProfits = 0;

    // for (long ele : profits) {System.out.print(ele+ " ");}

    for (int i=0;i<profits.length;i++) {
      maxProfits += (profits[i] * clicks[i]);
    }

    System.out.println(maxProfits);

  }

  public static Marketing readFile(String filepath) throws Exception{

    File file = new File(filepath);

    BufferedReader bf = new BufferedReader(new FileReader(file));

    int n = Integer.parseInt(bf.readLine());
    String st;

    long[] profits = new long[n];
    long[] clicks = new long[n];

    st = bf.readLine();
    String[] arr = st.split(" ");

    for (int i=0;i<arr.length;i++) {
      profits[i] = Integer.parseInt(arr[i]);
    }

    st = bf.readLine();
    String[] arr2 = st.split(" ");

    for (int i=0;i<arr2.length;i++) {
      clicks[i] = Integer.parseInt(arr2[i]);
    }

    Marketing m = new Marketing(profits, clicks);
    return m;


  }



}
