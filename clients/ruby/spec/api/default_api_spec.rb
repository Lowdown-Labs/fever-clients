require 'spec_helper'
require 'json'

describe 'DefaultApi' do
  before do
    @api_instance = FeverClient::DefaultApi.new
  end

  after do
  end

  describe 'test an instance of DefaultApi' do
    it 'should create an instance of DefaultApi' do
      expect(@api_instance).to be_instance_of(FeverClient::DefaultApi)
    end
  end

  describe 'health test' do
    it 'should work' do
    end
  end

  describe 'healthz_healthz_get test' do
    it 'should work' do
    end
  end

end
