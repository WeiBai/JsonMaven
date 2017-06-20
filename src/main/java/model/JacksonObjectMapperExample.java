package model;

import model.Address;
import model.Employee;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.io.FileUtils;

/**
 * Created by baiwe on 2017/6/20.
 */
public class JacksonObjectMapperExample {

    public static void main(String[] args) throws IOException {
        File file = new File(JacksonObjectMapperExample.class.getResource("/employee.txt").getFile());
        String content = FileUtils.readFileToString(file);

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        Employee emp = objectMapper.readValue(content, Employee.class);

        System.out.println("Employee Object\n" + emp);

        //Convert Object to json String
        Employee emp1 = createEmployee();
        //configure Object mapper for pretty print
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter stringEmp = new StringWriter();
        objectMapper.writeValue(stringEmp, emp1);
        System.out.println("Employee JSON is\n" + stringEmp);
    }

    public static Employee createEmployee(){
        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("David");
        emp.setPermanent(false);
        emp.setPhoneNumbers(new long[] {2537181,6371910});
        emp.setRole("Manager");

        Address add = new Address();
        add.setCity("Liverpool");
        add.setStreet("Oxford");
        add.setZipcode(34983);
        emp.setAddress(add);

        List<String> cities = new ArrayList<String>();
        cities.add("Los Angeles");
        cities.add("Shang Hai");
        emp.setCities(cities);

        Map<String, String> props = new HashMap<String, String>();
        props.put("salary", "1000 RMB");
        props.put("age", "28 yeas");
        emp.setProperties(props);

        return emp;
    }
}
