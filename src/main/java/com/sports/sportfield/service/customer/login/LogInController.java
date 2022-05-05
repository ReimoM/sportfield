package com.sports.sportfield.service.customer.login;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LogInController {

    @Resource
    private LogInService loginService;

    @PostMapping
    public LogInResponse getValidUser(@RequestBody LogInRequest request) {
        return loginService.getValidUser(request);
    }

    // TODO: 28.04.2022 //Controller tagastab LoginResponse objekti kus sees on userId ja userRoleId.
//  Lisada siia controller, mis võtab sisse JSON objekti, kus on username ja password

//requestiobjekt edastada login servicile,mis omakorda edastab user servicile (meetod getValidUser).
// user service pöördub userrepository poole. Seal peaks olema meetod, mis otsib username ja parooli järgi andmebaasist user objekti(entity)
// see repository meetod peaks olema tehtud nii et tulemus mähitakse optionali sisse.
//Tulemus käes võiks selle edastada validation servicile(userExists meetod).
//Selle validatsiooni sees peaks kontrollima .isEmpty() abil kas leiti tulemus ja kui ei siis throw new abil visata business error.
//Saadud user tagastatakse login servicisse.
//Kui user on olemas, siis selle küljest saab userId.
//userId pane logInResponse objetki külge.
//LoginIn Servicist kutsutakse välja userRoleService(meetod) getUserRoleById()
//userRole objektist saad kätte userRoleId, pane see logInResponse objekti külge.
//tagasta controlleriga logInResposne objekt.
//loo front endis selle teenuse jaoks front lahendus(kaasa arvatud error).
}
