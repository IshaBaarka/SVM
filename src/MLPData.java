import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MLPData {

public MLPData() {
Random rand = new Random(System.nanoTime());
try {
BufferedWriter out = new BufferedWriter(new FileWriter(
                      "mldata.csv"));
      out.write("Temp,Humidity,Visibility,Wind,Precip,Time,Avspeed\n");
 
for (int i = 0; i < 10000; i++) 
{ StringBuilder sb = new StringBuilder(); 
switch (rand.nextInt(3)) {
case 0:
        sb.append((rand.nextInt(20) + 1) + ","); 
        sb.append((rand.nextInt(83) + 1) + ","); 
        sb.append((rand.nextInt(9) + 1) + ","); 
        sb.append((rand.nextInt(6)+ 1) + ","); 
        sb.append((rand.nextInt(3) + 1 ) + ","); 
        sb.append((rand.nextInt(120) - 2) + ","); 
        sb.append((rand.nextInt(82)) + ",");
break;
case 1:
    sb.append((rand.nextInt(17) + 4) + ","); 
    sb.append((rand.nextInt(61) + 1) + ","); 
    sb.append((rand.nextInt(12) + 1) + ","); 
    sb.append((rand.nextInt(10) + 3) + ","); 
    sb.append((rand.nextInt(1) + 5) + ","); 
    sb.append((rand.nextInt(120) - 20) + ",");
    sb.append((rand.nextInt(82)) + "\n");
break;

case 2:
    sb.append((rand.nextInt(18) + 1) + ","); 
    sb.append((rand.nextInt(57) + 1) + ","); 
    sb.append((rand.nextInt(4) + 1) + ","); 
    sb.append((rand.nextInt(6) + 2) + ","); 
    sb.append((rand.nextInt(2) + 4) + ","); 
    sb.append((rand.nextInt(120) - 30) + ",");
    sb.append((rand.nextInt(82)) + "\n");
break;
case 3:
    sb.append((rand.nextInt(22) + 1) + ","); 
    sb.append((rand.nextInt(75) + 1) + ","); 
    sb.append((rand.nextInt(4) +  8) + ","); 
    sb.append((rand.nextInt(8) + 1) + ","); 
    sb.append((rand.nextInt(1)) + ","); 
    sb.append((rand.nextInt(120) - 60) + ",");
    sb.append((rand.nextInt(82)) + "\n");
break;
default:
break;
                        }
                        out.write(sb.toString());
        }
        out.close();
        } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        public static void main(String[] args) {
        MLPData mlp = new MLPData(); }
  }
