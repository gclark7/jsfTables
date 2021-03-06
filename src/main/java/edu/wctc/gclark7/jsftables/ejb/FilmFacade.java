/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wctc.gclark7.jsftables.ejb;

import edu.wctc.gclark7.jsftables.entity.Film;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author greg clark <gclark7@my.wctc.edu>
 */
@Stateless
public class FilmFacade extends AbstractFacade<Film> {
    @PersistenceContext(unitName = "edu.wctc.gclark7_jsftables_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FilmFacade() {
        super(Film.class);
    }
    
}
