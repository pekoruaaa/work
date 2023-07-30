package com.ruanko.hlearning.login.dao;



import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LogininfoMapper {

//    @Select("SELECT count(*) FROM `staffinfo` where jobnum = #{jobnum} and pwd = md5(#{pwd}) ;")
//    int StaffLogin(String jobnum,String pwd);
//
//    @Select("SELECT state FROM `staffinfo` where jobnum = #{jobnum} ;")
//    int StaffLoginState(String jobnum);
//
//    @Select("SELECT state FROM `admininfo` where loginnum = #{loginnum} ;")
//    int AdminLoginState(String loginnum);
//
//    @Select("SELECT count(*) FROM `admininfo` where loginnum = #{loginnum} and pwd = md5(#{pwd});")
//    int AdminLogin(String loginnum,String pwd);
//
////    @Insert("INSERT INTO staffinfo(jobnum, name, phone,age,sex,education,department,post,jointime,pwd,state,creator,createtime)" +
////            "VALUES(#{jobnum},#{name},#{phone},#{age},#{sex},#{education},#{department},#{post},#{jointime},md5(#{pwd}),#{state},#{creator},#{createtime})")
////    int Register(Staffinfo staffinfo);
//
//
//    @Select("SELECT count(*) FROM `staffinfo` where jobnum = #{jobnum};")
//    int findStaff(String jobnum);
//
//
//    @Select("SELECT count(*) FROM `admininfo` where loginnum = #{jobnum};")
//    int findLogin(String jobnum);
//
//    @Select("SELECT name FROM `staffinfo` where jobnum = #{jobnum}")
//    String findStaffName(String jobnum);
//
//    @Select("SELECT staffid FROM `staffinfo` where jobnum = #{jobnum}")
//    int findStaffId(String jobnum);
//
//    @Select("SELECT name FROM `admininfo` where loginnum = #{loginnum}")
//    String findAdminName(String loginnum);
//
//    @Select("SELECT adminid FROM `admininfo` where loginnum = #{loginnum}")
//    int findAdminId(String loginnum);
}

