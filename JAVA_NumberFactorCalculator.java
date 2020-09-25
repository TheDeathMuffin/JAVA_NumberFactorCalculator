

import java.util.ArrayList;

public class FactorNumbers
{
    static ArrayList<Integer> factorArrays = new ArrayList<Integer>();
    //int[] factorArray;
    static double holder1;
    static double holder2;
    static boolean add = true;
    static int h = 0;

    public static void returnFactors(int number)
    {
        String dimensionsList = "";
        int factorCount = 1;

        factorArrays.add(1);
        factorArrays.add(number);
        dimensionsList += ("| 1x" + number + " | ");
        if (number == 0)
        {
            System.out.println("Program cannot accept 0s.");
        }
        else
        {
            for (int i = 2; i < number; i++)
            {
                holder1 = (float)number / i;
                holder2 = (float)Math.floor(number / i);
                if (holder1 == holder2)
                {
                    h++;
                    for (int j = 0; j < factorArrays.size(); j++)
                    {
                        if (holder2 == factorArrays.get(j))
                        {
                            add = false;
                        }
                    }
                    if (add)
                    {
                        factorArrays.add(i);
                        factorArrays.add((int)holder2);
                        dimensionsList += (i + "x" + (int)holder2 + " | ");
                        add = true;
                        factorCount++;
                    }
                }
            }
        }
        System.out.println( number + " has " + factorCount + " factor(s), shown below:");
        System.out.println(dimensionsList);
        //System.out.println(factorArrays);
        return;
    }

    public static void main(String[] args)
    {
        returnFactors(1432412341);
    }
}

