
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import weka.classifiers.Evaluation;
import weka.classifiers.functions.LibSVM;
import weka.clusterers.SimpleKMeans;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class MLLibSVMTest {
	public MLLibSVMTest(String filepath){
		Instances data;
		try {
			data = DataSource.read(filepath);
			

	        if (data.classIndex() == -1)
	            data.setClassIndex(data.numAttributes() - 1);
			LibSVM svm = new LibSVM();
			String[] options = weka.core.Utils.splitOptions("-K 0 -D 3 -split-percentage 10");
			svm.setOptions(options);
	        svm.buildClassifier(data);
	        
	       showInstanceClassifications(svm, data);
			
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
  	}
	
	 public void showInstanceClassifications(LibSVM svm, Instances data) {
 		try {
 			
 			 File file = new File("file.txt");
	           FileOutputStream fos = new FileOutputStream(file);
	           PrintStream ps = new PrintStream(fos);

 			for (int i = 0; i < data.numInstances(); ++i) {
 				  // Set file print stream.
 	           System.setOut(ps);
 			   System.out.println("Instance " + i + "  Classified as  "
 						+ data.classAttribute().value((int)svm.classifyInstance(data.instance(i))));
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		
 	}
	
	public static void main(String[] args)throws FileNotFoundException {
		MLLibSVMTest mllsvm = new MLLibSVMTest("/Users/pAdu/Desktop/experiment/mldata.arff");
	}

}