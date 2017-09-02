package campAssignmentsApi;

import java.util.Date;

/**
 * @author Bert
 * 
 * Public API version of a Camp object.
 */
public class Camp {
    private long campId;
    private String description;
    private Date startDate;
    private Date endDate;

    /**
     * Default constructor required for serialization.
     */
    public Camp() {
    }
    
    public Camp(long id, String description, Date startDate, Date endDate) {
    	setId(id);
    	setDescription(description);
    	setStartDate(startDate);
    	setEndDate(endDate);
    }
    
    public long getId() {
    	return campId;
    }
    
    public void setId(long id) {
    	this.campId = id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
    	this.description = description; 
    }

    public Date getStartDate() {
    	return startDate;
    }
    
    public void setStartDate(Date startDate) {
    	this.startDate = startDate;
    }
    
    public Date getEndDate() {
    	return endDate;
    }
    
    public void setEndDate(Date endDate) {
    	this.endDate = endDate;
    }

}
