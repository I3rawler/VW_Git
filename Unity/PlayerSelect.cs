using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerSelect : MonoBehaviour
{

    public int PlayerId;

    public static GameObject[] ingameplayers;

    // Start is called before the first frame update
    void Start()
    {
        //PlayerId = gameObject.GetComponent<PlayerMovement>().PlayerId;
        ingameplayers = new GameObject[4];
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void AddPlayer(GameObject character)
    {
        switch (PlayerId)
        {

            case 1:
                #region player1
                GameManager.playerList[0] = character.gameObject;

                break;
            #endregion

            case 2:
                #region player2
                GameManager.playerList[1] = character.gameObject;

                break;
            #endregion;

            case 3:
                #region player3
                GameManager.playerList[2] = character.gameObject;

                break;
            #endregion

            case 4:
                #region player4
                GameManager.playerList[3] = character.gameObject;

                break;
            #endregion


            default:
                Debug.Log($"PlayerID not found. {gameObject.name}");
                break;

        }


    }

    public static bool VictoryCheck()
    {
        int count = 0;

        foreach(GameObject player in ingameplayers)
        {
            if(player != null)
            {
                count++;
            }
        }

        if(count == 1)
        {
            FindObjectOfType<GameManager>().UpdateWinner();
            return true;
        }
        else
        {
            return false;
        }
    }

    public static string GetWinner()
    {
        string winner = "";

        foreach (GameObject player in ingameplayers)
        {
            if (player != null)
            {
                winner = player.GetComponent<Player>().characterName.ToString();
            }
        }



        return winner;
    }

    public static int GetWinnerID()
    {
        int winner = 0;

        foreach (GameObject player in ingameplayers)
        {
            if (player != null)
            {
                winner = player.GetComponent<PlayerMovement>().PlayerId;
            }
        }



        return winner;
    }

    public void RemovePlayer()
    {
        switch (PlayerId)
        {
            case 1:
                GameManager.playerList[0] = GameObject.Find("P1");
                break;

            case 2:
                GameManager.playerList[1] = GameObject.Find("P2");
                break;

            case 3:
                GameManager.playerList[2] = GameObject.Find("P3");
                break;

            case 4:
                GameManager.playerList[3] = GameObject.Find("P4");
                break;
        }
    }

    public void UpdatePlayerID(int ID)
    {
        PlayerId = ID;
    }
}
