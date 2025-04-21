package W5_builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder[] list = {new GamingComputerBuilder(), new OfficeComputerBuilder(), new OldComputerBuilder()};

        for (ComputerBuilder builder : list){
            ComputerDirector director = new ComputerDirector(builder);
            director.constructComputer();
            Computer computer = builder.getComputer();
            System.out.println("\n" + computer);
        }
    }
}
