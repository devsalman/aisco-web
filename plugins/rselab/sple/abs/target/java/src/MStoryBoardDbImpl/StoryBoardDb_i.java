package MStoryBoardDbImpl;
// StoryBoardDb.abs:8:0: 
public interface StoryBoardDb_i extends abs.backend.java.lib.types.ABSInterface {
    // StoryBoardDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MStoryBoardModel.StoryBoard_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // StoryBoardDb.abs:9:1: 
    public  ABS.StdLib.List<MStoryBoardModel.StoryBoard_i> findAll(abs.backend.java.lib.types.ABSString className);
    // StoryBoardDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MStoryBoardModel.StoryBoard_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // StoryBoardDb.abs:10:1: 
    public  ABS.StdLib.List<MStoryBoardModel.StoryBoard_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // StoryBoardDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MStoryBoardModel.StoryBoard_i> async_find(abs.backend.java.lib.types.ABSString className);
    // StoryBoardDb.abs:11:1: 
    public  MStoryBoardModel.StoryBoard_i find(abs.backend.java.lib.types.ABSString className);
    // StoryBoardDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MStoryBoardModel.StoryBoard_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // StoryBoardDb.abs:12:1: 
    public  MStoryBoardModel.StoryBoard_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // StoryBoardDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MStoryBoardModel.StoryBoard_i object);
    // StoryBoardDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MStoryBoardModel.StoryBoard_i object);
    // StoryBoardDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MStoryBoardModel.StoryBoard_i object);
    // StoryBoardDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MStoryBoardModel.StoryBoard_i object);
    // StoryBoardDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MStoryBoardModel.StoryBoard_i> async_update(MStoryBoardModel.StoryBoard_i object);
    // StoryBoardDb.abs:15:1: 
    public  MStoryBoardModel.StoryBoard_i update(MStoryBoardModel.StoryBoard_i object);
    // StoryBoardDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // StoryBoardDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
