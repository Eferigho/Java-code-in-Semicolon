package com.hashcode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class HashCodeReadFile {


    private static String outputFiles = "data/also_big_data.txt";

    
    private static List<Integer> numberOfRotation = new ArrayList<>();
    private static List<Integer> pizzaTypes = new ArrayList<>();
    
    
   
    private static String [] fileNames = {"data/example_data.in", "data/small_data.in", "data/medium_data.in",
    		"data/quite_big_data.in", "data/also_big_data.in"};
    
    
    
    public static void main(String[] args) throws IOException{
    	
        
   	 File fr = new File("data/also_big_data.in");
        String filePath = fr.getAbsolutePath();
        readFiles(filePath);
        
        List<Integer> result = generateValidTypes(numberOfRotation, pizzaTypes);
        

        
        generatOutPutFile(new File(outputFiles), result);
   	

	    }
   
   
    public static List<Integer> generateValidTypes(List<Integer> numberOfRotation, List<Integer> pizzaTypes) {
    	
    	int maxSlice = numberOfRotation.get(0);

    	List<Integer> result = new ArrayList<>();
    	
    	int temp = 0;
    	
    	for(int row = (pizzaTypes.size()-1); row > -1; row--) {
    		
    		if((pizzaTypes.get(row) + temp) == maxSlice){
    			
    			
    			result.add(0,row);
    			temp = pizzaTypes.get(row) + temp;
    			
    		}
    		else if((pizzaTypes.get(row) + temp) < maxSlice) {
    			
    			result.add(0,row);
    			temp = pizzaTypes.get(row) + temp;
    			
    		}
    		else if((pizzaTypes.get(row)) > maxSlice) {
    			break;
    		}
    		
    		
    	}
    	
    	
    	return result;
    }

    
    public static void readFiles(String fileName) throws IOException{
    	
        try{
            BufferedReader reader = new BufferedReader(new FileReader( fileName));
            String readings;
            String firstRead;
            

            firstRead = reader.readLine();

            String[] values;
            values = firstRead.split(" ");
            
   
            
            int max_Slice = Integer.valueOf(values[0]);
            int num_of_Pizza = Integer.valueOf(values[1]);
            
            numberOfRotation.add(max_Slice);
            numberOfRotation.add(num_of_Pizza);
            
            
            // create a pizza list
            while ((readings = reader.readLine()) != null){
            	
                String chars [] = readings.split(" ");
                for(String cha : chars){
                    pizzaTypes.add(Integer.valueOf(cha));
                }

            }
            reader.close();


        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }


    }

    public static void generatOutPutFile(File file, List<Integer> outputValues) throws IOException{
    	
    	
        try(Formatter printer = new Formatter(outputFiles)){
            
            
            printer.format("%d%n", outputValues.size());
            System.out.println(outputValues.size());
            
            for(Integer outputdata : outputValues){
              
            	printer.format("%d ", outputdata);
                System.out.print(outputdata + " ");
                
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

	}

