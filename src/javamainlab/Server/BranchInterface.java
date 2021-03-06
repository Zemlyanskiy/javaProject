/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainlab.Server;

/**
 *
 * @author Umlore
 */

enum GrowthDirection { left, right, up};


public interface BranchInterface {
    
    public static double PI = 3.1415926535;
    
    public void GenerateChildBranch();
    
    public void DeleteThisBranch();
        
    public BranchInterface GetParentBranch();
    
    public BranchInterface GetChildFirstBranch();
    
    public BranchInterface GetChildSecondBranch();
    
    public BranchInterface ReturnThisBranch();
    
    public boolean IsGrowth();
    
    public void PlusPlusBranch();
    
    public void Growth();
    
    public String ToString();
    
    public int ReturnNumberAll();
    
    public BranchInterface FromString(String str, BranchInterface Parent);
    
    public void SetBranch(String str);
    
    // листья потом сделаем
}
