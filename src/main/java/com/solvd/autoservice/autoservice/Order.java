package com.solvd.autoservice.autoservice;

import com.solvd.autoservice.client.Client;
import com.solvd.autoservice.detail.Detail;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Date;
import java.util.List;

public class Order extends Thread{

    private static final Logger LOGGER = LogManager.getLogger (Order.class);

    private List<Client> clients;
    private List<Detail> details;
    private int detailsReplacementInMin;
    private Date startDate;

    public Order(List<Client> clients, List<Detail> details) {
        this.clients = clients;
        this.details = details;
    }

    public int getSum(){
        int result = 0;
        for (int i = 0; i < details.size(); i++) {
            result = result + details.get(i).getDetailCost();
        }
        return result;
    }

    public void printDetails(){
        LOGGER.info (" List of details: \n ");
        for (int i = 0; i < details.size(); i++) {
            details.get(i).getDetailName();
            details.get(i).getDetailCost();
            LOGGER.info(  " Name " + details.get(i).getDetailName() + " Price " + details.get(i).getDetailCost() + "\n");
        }
    }

    public Date getFinishDate(){
        return getFinishDate(this.startDate);
    }
    public Date getFinishDate(Date dateOfBeginning){
        long startDateInMsec = dateOfBeginning.getTime();
        long finishDateInMsec = (this.detailsReplacementInMin * 60 * 1000) + startDateInMsec;
        return new Date(finishDateInMsec);
    }

    public boolean canOrderBeCompleted(){
        boolean result = false;
        for (int i = 0; i < details.size(); i++) {
            result = details.get(i).isOnStorage();
            if (!result){
                break;
            }
        }
        return result;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public int getDetailsReplacementInMin() {
        return detailsReplacementInMin;
    }

    public void setDetailsReplacementInMin(int detailsReplacementInMin) {
        this.detailsReplacementInMin = detailsReplacementInMin;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
