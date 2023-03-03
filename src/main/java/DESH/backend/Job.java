package DESH.backend;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Job {
    OWNER, NORMAL, REALTOR;

    @JsonCreator
    public static Job stringToEnum(String val) {
        for (Job job : Job.values()) {
            if (job.name().equals(val.toUpperCase())) {
                return job;
            }
        }
        return null;
    }
}
