package com.tech.cholla.db.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.cholla.db.entity.Users;
import com.tech.cholla.db.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserServices {
	
	@Autowired
	UserRepository userRepository;

	/*@Autowired
	@LoadBalanced
	public RestTemplate restTemplate;*/
	
	@Override
	public List<Users> getDetailsByName(String name) {		
		//List<Users> userList = userRepository.findByName(name);
		//return userList;
		return null;
	}

	
	/*@SuppressWarnings("unchecked")
	public Output findByUserName() {
		// TODO Auto-generated method stub
		System.out.println("User Service from service"+restTemplate.toString());
		List<Users> usrslist = null;
		Output output = null;
		//userList = restTemplate.getForObject(DBConstants.USER_SERVICE_URL+"/users/{name}", List.class, name)
		usrslist = restTemplate.getForObject(DBConstants.USER_SERVICE_URL+"/users", List.class);
		
		ObjectMapper objmapper = new ObjectMapper();
		objmapper.enable(SerializationFeature.INDENT_OUTPUT);
		String arraystojson = "";
		try{
			if (usrslist.size()>0){
				arraystojson = objmapper.writeValueAsString(usrslist);
				output = new  Output(DBConstants.SUCCESS_MSG, arraystojson, usrslist);
			}
		
		}catch(JsonParseException jexp){
			jexp.printStackTrace();
		}catch(Exception exp){
			output = new Output(DBConstants.FAILURE_MSG, "Empty List", null);
		}
		return output;
	}
*/
	@Override
	public List<Users> getDetailsById(int id) {
		return userRepository.findById(id);
	}


	@Override
	public Iterable<Users> findAll() {
		return userRepository.findAll();
	}

}
