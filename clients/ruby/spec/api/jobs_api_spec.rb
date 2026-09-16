require 'spec_helper'
require 'json'

describe 'JobsApi' do
  before do
    @api_instance = FeverClient::JobsApi.new
  end

  after do
  end

  describe 'test an instance of JobsApi' do
    it 'should create an instance of JobsApi' do
      expect(@api_instance).to be_instance_of(FeverClient::JobsApi)
    end
  end

  describe 'cancel_job test' do
    it 'should work' do
    end
  end

  describe 'get_job test' do
    it 'should work' do
    end
  end

end
