public class OnlineStreamingAdapter implements MusicPlayer
{
    private OnlineStreamingService onlineStreamingService;
    public OnlineStreamingAdapter(OnlineStreamingService onlineStreamingService)
    {
        this.onlineStreamingService = onlineStreamingService;
    }
    @Override
    public void play()
    {
        onlineStreamingService.startStreaming();
    }
    @Override
    public void stop()
    {
        onlineStreamingService.stopStreaming();
    }
}