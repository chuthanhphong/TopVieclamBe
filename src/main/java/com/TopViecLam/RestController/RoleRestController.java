package com.TopViecLam.RestController;


import com.TopViecLam.Until.Constant;
import com.TopViecLam.model.User;
import com.TopViecLam.repository.IJobRepository;
import com.TopViecLam.service.company.CompanyService;
import com.TopViecLam.service.danhSachCv.IDanhSachCvService;
import com.TopViecLam.service.job.IJobService;
import com.TopViecLam.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(Constant.ContantAPI.ADMIN)
public class RoleRestController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IJobService jobService;

    @Autowired
    private IDanhSachCvService danhSachCvService;

    @Autowired
    private CompanyService companyService;

    @GetMapping(Constant.ContantAPI.ALL)
    public ResponseEntity<Iterable<User>> findAllUser(){
        Iterable<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
