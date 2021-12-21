package com.example.testproject.controller;
import com.example.testproject.bean.CourseDetails;
import com.example.testproject.service.CourseDetailsService;
import com.example.testproject.service.FacultyService;
import com.example.testproject.bean.Facultys;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.List;

@Path("login")
public class FacultyController {

    @POST
    @Path("/verify")
    @Produces(MediaType.TEXT_PLAIN) //return type
    @Consumes(MediaType.APPLICATION_JSON) //parameter
    public Response loginFaculty(Facultys faculty) throws URISyntaxException {
        int val = new FacultyService().verifyFaculty(faculty); //in service
        if (val != 0)
        {
            List<CourseDetails> TT = new CourseDetailsService().showtimeTable(val);
            return (Response) TT;
        }
        else
        {
            return Response.status(203).build();
//              return "false";
        }
    }

    @POST
    @Path("/timetable")
    @Produces(MediaType.TEXT_PLAIN) //return type
    @Consumes(MediaType.APPLICATION_JSON) //parameter
    public Response showTimetable(Facultys faculty) throws URISyntaxException {
        List<CourseDetails> result = new CourseDetailsService().showtimeTable(faculty.getId()); //in service
        if (!result.isEmpty())
        {
            return (Response) result;
        }
        else
        {
            return Response.status(203).build();
//              return "false";
        }
    }


    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN) //return type
    @Consumes(MediaType.APPLICATION_JSON) //parameter
    public Response addFaculty(Facultys faculty) throws URISyntaxException {
        boolean val = new FacultyService().addFaculty(faculty); //in service
        if (val == true)
            return Response.ok().build();
        else
            return Response.status(203).build();
    }
}