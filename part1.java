import edu.duke.FileResource;
public class part1 {
    public void readFood(){
        FileResource fr = new FileResource();
        org.apache.commons.csv.CSVParser parser = fr.getCSVParser();
        for (org.apache.commons.csv.CSVRecord record : parser){
            System.out.print(record.get("Name")+ " ");
            System.out.print(record.get("Favorite Color") + " ");
            System.out.println(record.get("Favorite Food"));
        }
    }

    public static void main(String[] args) {
        part1 csv = new part1();
        csv.readFood();
    }
}
