import java.util.Arrays;
import java.util.List;
public class Problem_06
{
        public static void main(String[] args)
        {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
            List<List<Integer>> result = frontBackSplit(list);
            System.out.println(result);
        }
        public static <T> List<List<T>> frontBackSplit(List<T> list)
        {
            List<List<T>> res = new ArrayList<>();
            int size = list.size();
            int mid = (size + 1) / 2;
            List<T> front = new ArrayList<>(list.subList(0, mid));
            List<T> back = new ArrayList<>(list.subList(mid, size));
            res.add(front);
            res.add(back);
            return res;
        }
    }
















    public static <T> List<List<T>> frontBackSplit(List<T> list)
    {
        List<List<T>> result = new ArrayList<>();
        int size = list.size();
        int mid = (size + 1) / 2;
        List<T> front = new ArrayList<>(list.subList(0, mid));
        List<T> back = new ArrayList<>(list.subList(mid, size));
        result.add(front);
        result.add(back);
        return result;
    }
}

