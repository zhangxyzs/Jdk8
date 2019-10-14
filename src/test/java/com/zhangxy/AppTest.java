package com.zhangxy;

import com.zhangxy.stream.Person;
import com.zhangxy.stream.StreamApi;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void shoultestdAnswerWithTrue()
    {
        System.out.println(getData());
    }
    public Person getData(){
        StreamApi api=new StreamApi();
        List<Person> data = api.getData();
        for(Person person:data){
            if(person.getName().equals("zhangsan")){
                return person;
            }
        }
        return null;
    }
}
