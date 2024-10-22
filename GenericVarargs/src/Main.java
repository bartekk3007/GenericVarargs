import java.util.ArrayList;
import java.util.Collection;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class Main
{
    public static void main(String[] args)
    {
        Collection<Pair<String>> table = new ArrayList<>();
        Pair<String> pair1 = new Pair<>("Andrzej", "Bartek");
        Pair<Integer> pair2 = new Pair<>(2, 3);
        Pair<String> pair3 = new Pair<>("Cezary", "Daniel");
        addAll(table, pair1, pair3);

        var resultPair = makePair(String::new);
        System.out.println(resultPair);

        var resultArray = Main.minmax(String[]::new, "Bartek", "Andrzej");
        System.out.println(resultArray);
    }
    @SafeVarargs
    public static <T extends Pair> void addAll(Collection<T> collection, T... args)
    {
        args[0].setFirst("Edward");
        for (T arg : args)
        {
            collection.add(arg);
            System.out.println(arg);
        }
    }

    public static <T> Pair<T> makePair(Supplier<T> constr)
    {
        return new Pair<>(constr.get(), constr.get());
    }

    public static <T extends Comparable> T[] minmax(IntFunction<T[]> constr, T... a)
    {
        T[] result = constr.apply(2);
        return result;
    }
}