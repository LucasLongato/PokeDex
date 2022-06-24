package br.com.pokedex.network;

import br.com.pokedex.App.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class ViewPoke {
    public static void main(String[] args) throws Exception {


        JSONObject object = new HTTPRequest().requestGetMethod("https://pokeapi.co/api/v2/pokemon?limit=151");
        AppPoke apppoke = new AppPoke();
        // int count = object.getInt("count");
        // String next = object.getString("next");
        JSONArray array = object.getJSONArray("results");
        AppPoke.letsGoPoke();
        int pokeInt = AppPoke.userChoice();
        for (int index = 0; index < array.length(); index++) {
            JSONObject pokeObject = array.getJSONObject(index);

            String pokeNome = pokeObject.getString("name");
            System.out.println("| " + index + " -->  " + pokeNome);
        }

        int pokedexApp;
        pokedexApp = AppPoke.userChoice();

        //PEGA A URL do Pokemon escolhido
        JSONObject pokeObject1 = array.getJSONObject(pokemon);
        String pName = pokeObject1.getString("name");
        String pUrl = pokeObject1.getString("url");

        System.out.println("================================================================");
        System.out.println("|                          POKEMON ESCOLHIDO                    |");
        System.out.println("================================================================");
        System.out.println("| " + namePoke + "|");


        JSONObject object2 = new HTTPRequest().requestGetMethod(pUrl);

        // Ira mostrar a Imagem do Pokemon
        ImagensPoke imagensPoke = new ImagensPoke();
        System.out.println(imagensPoke.getPokemonImage(pokeInt)); 
        //Mostra qual o Tipo do pokemon
        JSONArray arrayTypes = object2.getJSONArray("types");
        System.out.println("\n" + "TIPOS:");
        for (int i = 0; i < arrayTypes.length(); i++) {
            JSONObject typesPoke = arrayTypes.getJSONObject(i).getJSONObject("type");
            String name = typesPoke.getString("name");
            System.out.println(" *" + type);
        }
        //Mostrara os movimentos do Pokemon pode fazer
        JSONArray arrayMoves = object2.getJSONArray("movi");
        System.out.println("\n" + " Movimentos  ");
        for (int i = 0; i < arrayMoves.length(); i++) {
            JSONObject movePoke = arrayMoves.getJSONObject(i).getJSONObject("movi");
            String name = movePoke.getString("name");
            System.out.println(" *" + movi);
        }
        //Ira mostrar o status que o pokemon esta
        JSONArray arrayStats = object2.getJSONArray("stats");
        System.out.println("\n" + "STATUS:");
        for (int i = 0; i < arrayStats.length(); i++) {
            JSONObject typesPoke = arrayStats.getJSONObject(i).getJSONObject("stat");
            int baseStat = arrayStats.getJSONObject(i).getInt("stats");
            String name = typesPoke.getString("name");
            System.out.println(" *" + stats);

        }
        //Mostra as habilidades do Pokemon
        JSONArray arrayAbilities = object2.getJSONArray("abilities");
        System.out.println("\n" + "| HABILIDADES: ");
        for (int i = 0; i < arrayAbilities.length(); i++) {
            JSONObject abilitiesPoke = arrayAbilities.getJSONObject(i).getJSONObject("ability");
            String name = abilitiesPoke.getString("name");
            System.out.println(" *" + ability);
        }
    }
}
}



