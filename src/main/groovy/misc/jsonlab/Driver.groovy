package misc.jsonlab

import com.fasterxml.jackson.core.JsonGenerator
import groovy.json.JsonOutput

import java.util.regex.Matcher
import java.util.regex.Pattern
import groovy.json.JsonOutput

/**
 * Created by mdb on 10/19/18.
 */
public class Driver {

    private String urlPttrn

    public static void main(String[] args) {
        Pattern headerPttrn1 = ~"=+\\w+\\s?\\w+=+"
        Pattern  headerPttrn2 = ~'=+\\w+\\s?\\w+\\s?\\w+\\s?\\w+\\s?\\w+=+'
        Pattern  headerPttrn3 = ~'=+\\w+\\s?\\w+\\s?\\w+\\s?\\w+\\s?\\w+=+'
        Pattern   headerPttrn4 = ~'\\s?=+\\s?\\w+\\s?\\w+\\s?\\w+\\s?\\w+\\s?\\w+\\s?=+\\s?'
        Pattern namePttrn = ~'\\s?\\w+\\s?\\w+\\s?\\w+\\s?\\w+\\s?\\w+\\s?'
        Pattern urlPttrn = ~'http(s)?:.*'
        Pattern headerEndPttrn = ~'=+\\s?End'
        Matcher matcher0 = null
        Matcher matcher1 = null
        String name = null ;
        ArrayList<String> urls = null ;
        LinkedHashMap<String,String > urlDict = new LinkedHashMap<>() ;
        Category category = null ;
        File outFile = new File("/Users/mdb/data/top.hoes.out")
        new File("/Users/mdb/data/top.hoes").eachLine{
                    //println(it.getClass())
                    matcher0 = headerPttrn4.matcher(it)
                    matcher1 =  urlPttrn.matcher(it)

            if(matcher0.find()){
                String match = matcher0.group(0)
                name = match.replaceAll("=","")
                println(it)
                urlDict.put(name ,new ArrayList<String>()) ;
                category = new Category(name,urlDict)
            }
            if(matcher1.find()){
                String url = matcher1.group(0)
                /*
                println(url)
                if(category){
                    def _urls = category.getUrls()
                    _urls.add(url)
                }
                */
                urlDict[name].add(url);
            }
            //println(category.toString())
            //def output = JsonOutput.toJson(category)
            //def output = JsonOutput.toJson(urlDict)
        }
        def json = new groovy.json.JsonBuilder()
        json rootKey: urlDict
        //println(output)
        //outFile.append(output)
        outFile.append(json.toString());
        outFile.append("\n")
        println(urlDict)



    }

}
