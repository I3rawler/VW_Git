using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Points : MonoBehaviour
{
    static Points instance;

    public static int p1 = 0;
    public static int p2 = 0;
    public static int p3 = 0;
    public static int p4 = 0;

    // Start is called before the first frame update
    void Awake()
    {
        if (instance != null)
        {
            Destroy(gameObject);
        }
        else
        {
            instance = this;
        }

        DontDestroyOnLoad(gameObject);  
    }

    public static void AddPoint(int player)
    {
        if(player == 1)
        {
            p1++;
        }

        if(player == 2)
        {
            p2++;
        }

        if(player == 3)
        {
            p3++;
        }

        if(player == 4)
        {
            p4++;
        }
    }

}
