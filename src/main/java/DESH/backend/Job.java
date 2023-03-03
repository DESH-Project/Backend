package DESH.backend;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Job {
    OWNER, NORMAL, REALTOR;
    // 가게 주인, 학생, 일반인, 부동산 중개

    @JsonCreator
    public static Job stringToEnum(String val){
        for (Job job : Job.values()){
            if(job.name().equals(val.toUpperCase())){
                return job;
            }
        }
        return null;
    }
}
