package com.example.demo.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dhatim.fastexcel.Workbook;
import org.dhatim.fastexcel.Worksheet;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.util.RequestPayload;
import com.fasterxml.jackson.databind.util.JSONPObject;


public class ReadData {
	


	public static void main(String[] args) throws IOException {
		
//		String excelFilePath = "C:\\Users\\prathik.bj\\Downloads\\dummy.xlsx";
//		var f = new File(excelFilePath);
//		 
//		try (var wb = new ReadableWorkbook(f)) {
//            Sheet sheet = wb.getFirstSheet();
//            try (Stream<Row> rows = sheet.openStream()) {
//                var it = rows.iterator();
//                int i = 0;
//                while (it.hasNext()) {
//
//                    var row = it.next();
//                    row.stream().forEach(cell -> System.out.print(cell.getText()+" "));
//                    System.out.println();
//                    i++;
//                }
//            }
//        }
		
		
		
//		//new
//		
//		// ArrayList
//		ArrayList<String> list1 = new ArrayList<String>();
//		list1.add("India");
//		list1.add("China");
//		list1.add("Bhutan");
//		
//        int row = 0;
//        int col = 0;
//
//        var f = new File("C:\\Users\\prathik.bj\\Downloads\\my_New_dummy.xlsx");
//
//        try (var fos = new FileOutputStream(f)) {
//
//            var wb = new Workbook(fos, "Application", "1.0");
//            Worksheet ws = wb.newWorksheet("Sheet 1");
//            for(row = 0;row<10;row++) {
//	            for (var word : list1) {
//	
//	                ws.value(row, col, word);
//	                col++;
//	            }
//	            col = 0;
//        }
//            wb.finish();
//        }
		
		
//		String uri = "http://localhost:8080/user/getAllUser";
//		RestTemplate restTemplate = new RestTemplate();
//		String result = restTemplate.getForObject(uri, String.class);
//		System.out.println(result);
//		System.out.println(result.getClass());
		
		
//		
//		String url = "http://localhost:8080/user/getAllUser";
//		RestTemplate restTemplate = new RestTemplate();
//	    ResponseEntity<Users[]> response = restTemplate.getForEntity(url,Users[].class);
//	//	ResponseEntity<Invoice[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Invoice[].class);
//		Users[] invs = response.getBody();
//		java.util.List<Users> list = Arrays.asList(invs);
//		System.out.println(list);
//
////		logger.info("Response Body : {}", list);
////		logger.info("Status code value : {}", response.getStatusCodeValue());
////		logger.info("Status code : {}", response.getStatusCode().name());
////		logger.info("Headers {} :", response.getHeaders());
		
		
		String url = "http://localhost:8080/user/getUser/2123";
		RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<Users> response = restTemplate.getForEntity(url,Users.class);
	//	ResponseEntity<Invoice[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Invoice[].class);
		Users invs = response.getBody();
		System.out.println(invs.toString());
		
		
		
		
		
		var f = new File("C:\\Users\\prathik.bj\\Downloads\\my_New_dummy.xlsx");
		int row = 0;
		int col = 0;
	        try (var fos = new FileOutputStream(f)) {
	
	            var wb = new Workbook(fos, "Application", "1.0");
	            Worksheet ws = wb.newWorksheet("Sheet 1");
	            ws.value(row, col,invs.getUserId());
	            ws.value(row, col+1,invs.getUserName());
	            ws.value(row, col+2,invs.getUserClg());
	            ws.value(row, col+3,invs.getUserContact());
	            wb.finish();
	        }
		
	       
	        
	        
//	        Users usr = new Users();
//			usr.setUserId("UT12Xx");
//			usr.setUserClg("PES");
//			usr.setUserName("Prathik");
//			usr.setUserContact("9148489627");
//	        HttpEntity<String> request = new HttpEntity<>(usr.jsonifyObj(usr));
//	        ResponseEntity<String> response2 = restTemplate
//	          .exchange("http://localhost:8080/user/addUser", HttpMethod.POST, request, String.class);
//	        System.out.println(response2);
	        
	        Users requests = new Users("UT1213","PES","Prathik","9148489627");
	        System.out.println(requests);
	        ResponseEntity<AddUserResponse> response1 = restTemplate.postForEntity("http://localhost:8080/user/addUser",requests,AddUserResponse.class);
//	        AddUserResponse invs1 = response1.getBody();
//	        System.out.println("Hi2");
//	        System.out.println(invs1.toString());
	}
}
