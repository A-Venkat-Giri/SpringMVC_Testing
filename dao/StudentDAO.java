package com.dev.cgblrspringmvc.dao;

import com.dev.cgblrspringmvc.beans.StudentInfo;
import com.dev.cgblrspringmvc.beans.StudentOtherInfo;

public interface StudentDAO {
	
		public boolean registerStudent(StudentInfo info, StudentOtherInfo otherinfo);
		public StudentInfo auth(int id,String password);
		public boolean editStudent(StudentInfo info, StudentOtherInfo otherinfo);
		public boolean deleteStudent(StudentInfo info);
		

}
